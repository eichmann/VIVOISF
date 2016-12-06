package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryAgriculturalAreaYearIterator theterritory = (territoryAgriculturalAreaYearIterator)findAncestorWithClass(this, territoryAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theterritory.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

