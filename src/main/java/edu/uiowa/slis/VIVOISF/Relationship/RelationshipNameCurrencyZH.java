package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameCurrencyZHIterator theRelationship = (RelationshipNameCurrencyZHIterator)findAncestorWithClass(this, RelationshipNameCurrencyZHIterator.class);
			pageContext.getOut().print(theRelationship.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

