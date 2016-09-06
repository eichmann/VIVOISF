package edu.uiowa.slis.VIVOISF.EducationalProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EducationalProcessBFO_0000055Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EducationalProcessBFO_0000055Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EducationalProcessBFO_0000055Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EducationalProcessBFO_0000055Iterator theEducationalProcessBFO_0000055Iterator = (EducationalProcessBFO_0000055Iterator)findAncestorWithClass(this, EducationalProcessBFO_0000055Iterator.class);
			pageContext.getOut().print(theEducationalProcessBFO_0000055Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EducationalProcess for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EducationalProcess for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

