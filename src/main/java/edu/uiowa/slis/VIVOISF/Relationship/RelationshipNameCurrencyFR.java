package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameCurrencyFRIterator theRelationship = (RelationshipNameCurrencyFRIterator)findAncestorWithClass(this, RelationshipNameCurrencyFRIterator.class);
			pageContext.getOut().print(theRelationship.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

