package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameCurrencyESIterator theRelationship = (RelationshipNameCurrencyESIterator)findAncestorWithClass(this, RelationshipNameCurrencyESIterator.class);
			pageContext.getOut().print(theRelationship.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

