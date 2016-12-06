package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379HasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379HasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379HasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379HasSubjectAreaIterator theARG_2000379HasSubjectAreaIterator = (ARG_2000379HasSubjectAreaIterator)findAncestorWithClass(this, ARG_2000379HasSubjectAreaIterator.class);
			pageContext.getOut().print(theARG_2000379HasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

