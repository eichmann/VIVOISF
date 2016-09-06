package edu.uiowa.slis.VIVOISF.EducationalProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EducationalProcessRO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EducationalProcessRO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(EducationalProcessRO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EducationalProcessRO_0000057Iterator theEducationalProcessRO_0000057Iterator = (EducationalProcessRO_0000057Iterator)findAncestorWithClass(this, EducationalProcessRO_0000057Iterator.class);
			pageContext.getOut().print(theEducationalProcessRO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing EducationalProcess for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EducationalProcess for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

