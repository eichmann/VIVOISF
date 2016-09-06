package edu.uiowa.slis.VIVOISF.ARG_2000376;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000376SubjectAreaOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000376SubjectAreaOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000376SubjectAreaOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000376SubjectAreaOfIterator theARG_2000376SubjectAreaOfIterator = (ARG_2000376SubjectAreaOfIterator)findAncestorWithClass(this, ARG_2000376SubjectAreaOfIterator.class);
			pageContext.getOut().print(theARG_2000376SubjectAreaOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000376 for subjectAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000376 for subjectAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

