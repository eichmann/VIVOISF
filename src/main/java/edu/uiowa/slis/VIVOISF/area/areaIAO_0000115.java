package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaIAO_0000115 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaIAO_0000115 currentInstance = null;
	private static final Log log = LogFactory.getLog(areaIAO_0000115.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaIAO_0000115Iterator thearea = (areaIAO_0000115Iterator)findAncestorWithClass(this, areaIAO_0000115Iterator.class);
			pageContext.getOut().print(thearea.getIAO_0000115());
		} catch (Exception e) {
			log.error("Can't find enclosing area for IAO_0000115 tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for IAO_0000115 tag ");
		}
		return SKIP_BODY;
	}
}

