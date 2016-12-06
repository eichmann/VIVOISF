package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryAgriculturalAreaTotalIterator theterritory = (territoryAgriculturalAreaTotalIterator)findAncestorWithClass(this, territoryAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theterritory.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

