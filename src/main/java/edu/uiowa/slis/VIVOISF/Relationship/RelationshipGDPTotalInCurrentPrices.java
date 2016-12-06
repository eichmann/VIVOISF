package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipGDPTotalInCurrentPricesIterator theRelationship = (RelationshipGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, RelationshipGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theRelationship.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

