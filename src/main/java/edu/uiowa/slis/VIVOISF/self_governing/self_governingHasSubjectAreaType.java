package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingHasSubjectAreaIterator theself_governingHasSubjectAreaIterator = (self_governingHasSubjectAreaIterator)findAncestorWithClass(this, self_governingHasSubjectAreaIterator.class);
			pageContext.getOut().print(theself_governingHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

