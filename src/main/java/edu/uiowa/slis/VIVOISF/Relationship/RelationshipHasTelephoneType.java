package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipHasTelephoneIterator theRelationshipHasTelephoneIterator = (RelationshipHasTelephoneIterator)findAncestorWithClass(this, RelationshipHasTelephoneIterator.class);
			pageContext.getOut().print(theRelationshipHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

