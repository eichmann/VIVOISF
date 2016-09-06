package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013HasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013HasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013HasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013HasSubjectAreaIterator theIAO_0000013HasSubjectAreaIterator = (IAO_0000013HasSubjectAreaIterator)findAncestorWithClass(this, IAO_0000013HasSubjectAreaIterator.class);
			pageContext.getOut().print(theIAO_0000013HasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

