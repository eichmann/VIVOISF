package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryGDPYearIterator theterritory = (territoryGDPYearIterator)findAncestorWithClass(this, territoryGDPYearIterator.class);
			pageContext.getOut().print(theterritory.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

