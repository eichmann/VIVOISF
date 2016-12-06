package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameCurrencyENIterator theRelationship = (RelationshipNameCurrencyENIterator)findAncestorWithClass(this, RelationshipNameCurrencyENIterator.class);
			pageContext.getOut().print(theRelationship.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

