package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameListENIterator theRelationship = (RelationshipNameListENIterator)findAncestorWithClass(this, RelationshipNameListENIterator.class);
			pageContext.getOut().print(theRelationship.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

