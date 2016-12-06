package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryHDITotalIterator theterritory = (territoryHDITotalIterator)findAncestorWithClass(this, territoryHDITotalIterator.class);
			pageContext.getOut().print(theterritory.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

