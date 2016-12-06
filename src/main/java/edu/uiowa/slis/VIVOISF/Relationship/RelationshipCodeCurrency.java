package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipCodeCurrencyIterator theRelationship = (RelationshipCodeCurrencyIterator)findAncestorWithClass(this, RelationshipCodeCurrencyIterator.class);
			pageContext.getOut().print(theRelationship.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

