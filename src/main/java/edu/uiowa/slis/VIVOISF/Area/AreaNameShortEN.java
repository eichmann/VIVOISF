package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameShortENIterator theArea = (AreaNameShortENIterator)findAncestorWithClass(this, AreaNameShortENIterator.class);
			pageContext.getOut().print(theArea.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

