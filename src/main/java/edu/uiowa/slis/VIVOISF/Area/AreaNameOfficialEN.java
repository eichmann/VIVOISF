package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameOfficialENIterator theArea = (AreaNameOfficialENIterator)findAncestorWithClass(this, AreaNameOfficialENIterator.class);
			pageContext.getOut().print(theArea.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

