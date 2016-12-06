package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameOfficialENIterator thearea = (areaNameOfficialENIterator)findAncestorWithClass(this, areaNameOfficialENIterator.class);
			pageContext.getOut().print(thearea.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

