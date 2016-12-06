package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameListENIterator thearea = (areaNameListENIterator)findAncestorWithClass(this, areaNameListENIterator.class);
			pageContext.getOut().print(thearea.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

