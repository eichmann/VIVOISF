package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameCurrencyARIterator theRelationship = (RelationshipNameCurrencyARIterator)findAncestorWithClass(this, RelationshipNameCurrencyARIterator.class);
			pageContext.getOut().print(theRelationship.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

