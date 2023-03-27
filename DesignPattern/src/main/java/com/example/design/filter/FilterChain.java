package com.example.design.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
 private    List<Filter> filters = new ArrayList<>();
 private Target target;
 public void addFilter(Filter filter){
     filters.add(filter);
 }
 public void doFilter(HttpRequest httpRequest){
     for (Filter filter : filters){
         filter.foFilter(httpRequest);
     }
     target.execute(httpRequest);
 }
 public void setTarget(Target target){
     this.target = target;

 }
}
