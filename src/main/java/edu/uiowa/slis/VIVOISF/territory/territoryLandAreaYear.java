package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryLandAreaYearIterator theterritory = (territoryLandAreaYearIterator)findAncestorWithClass(this, territoryLandAreaYearIterator.class);
			pageContext.getOut().print(theterritory.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

