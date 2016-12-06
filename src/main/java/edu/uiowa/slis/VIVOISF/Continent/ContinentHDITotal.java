package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentHDITotalIterator theContinent = (ContinentHDITotalIterator)findAncestorWithClass(this, ContinentHDITotalIterator.class);
			pageContext.getOut().print(theContinent.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

