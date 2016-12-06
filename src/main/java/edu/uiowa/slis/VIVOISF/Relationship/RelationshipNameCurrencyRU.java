package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameCurrencyRUIterator theRelationship = (RelationshipNameCurrencyRUIterator)findAncestorWithClass(this, RelationshipNameCurrencyRUIterator.class);
			pageContext.getOut().print(theRelationship.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

