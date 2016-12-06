package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameCurrencyITIterator theRelationship = (RelationshipNameCurrencyITIterator)findAncestorWithClass(this, RelationshipNameCurrencyITIterator.class);
			pageContext.getOut().print(theRelationship.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

