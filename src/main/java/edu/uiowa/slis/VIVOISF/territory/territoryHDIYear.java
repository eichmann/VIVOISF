package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryHDIYearIterator theterritory = (territoryHDIYearIterator)findAncestorWithClass(this, territoryHDIYearIterator.class);
			pageContext.getOut().print(theterritory.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

