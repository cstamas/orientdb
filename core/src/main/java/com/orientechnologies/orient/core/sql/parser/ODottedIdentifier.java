/* Generated By:JJTree: Do not edit this line. ODottedIdentifier.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

public
class ODottedIdentifier extends SimpleNode {
  public ODottedIdentifier(int id) {
    super(id);
  }

  public ODottedIdentifier(OrientSql p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d72d9b6d5b33c987f35b984c4ba53ed5 (do not edit this line) */