package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeNumVolumes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeNumVolumes currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeNumVolumes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeNumVolumesIterator theCode = (CodeNumVolumesIterator)findAncestorWithClass(this, CodeNumVolumesIterator.class);
			pageContext.getOut().print(theCode.getNumVolumes());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for numVolumes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for numVolumes tag ");
		}
		return SKIP_BODY;
	}
}

