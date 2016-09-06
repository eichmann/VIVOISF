package edu.uiowa.slis.VIVOISF.AdvisingProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdvisingProcessRO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdvisingProcessRO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(AdvisingProcessRO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AdvisingProcessRO_0000057Iterator theAdvisingProcessRO_0000057Iterator = (AdvisingProcessRO_0000057Iterator)findAncestorWithClass(this, AdvisingProcessRO_0000057Iterator.class);
			pageContext.getOut().print(theAdvisingProcessRO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing AdvisingProcess for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisingProcess for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

