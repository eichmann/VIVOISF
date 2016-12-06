package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipHasAddressIterator theRelationshipHasAddressIterator = (RelationshipHasAddressIterator)findAncestorWithClass(this, RelationshipHasAddressIterator.class);
			pageContext.getOut().print(theRelationshipHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

