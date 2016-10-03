package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPerformerInverseIterator thePostdocPerformerInverseIterator = (PostdocPerformerInverseIterator)findAncestorWithClass(this, PostdocPerformerInverseIterator.class);
			pageContext.getOut().print(thePostdocPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for performer tag ");
		}
		return SKIP_BODY;
	}
}

