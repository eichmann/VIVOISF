package edu.uiowa.slis.VIVOISF.AdvisingProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdvisingProcessBFO_0000055 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdvisingProcessBFO_0000055 currentInstance = null;
	private static final Log log = LogFactory.getLog(AdvisingProcessBFO_0000055.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AdvisingProcessBFO_0000055Iterator theAdvisingProcessBFO_0000055Iterator = (AdvisingProcessBFO_0000055Iterator)findAncestorWithClass(this, AdvisingProcessBFO_0000055Iterator.class);
			pageContext.getOut().print(theAdvisingProcessBFO_0000055Iterator.getBFO_0000055());
		} catch (Exception e) {
			log.error("Can't find enclosing AdvisingProcess for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisingProcess for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

