package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameShortENIterator thearea = (areaNameShortENIterator)findAncestorWithClass(this, areaNameShortENIterator.class);
			pageContext.getOut().print(thearea.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

