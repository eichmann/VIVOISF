package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameListENIterator theArea = (AreaNameListENIterator)findAncestorWithClass(this, AreaNameListENIterator.class);
			pageContext.getOut().print(theArea.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

