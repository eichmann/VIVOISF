package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteFeaturesIterator theNoteFeaturesIterator = (NoteFeaturesIterator)findAncestorWithClass(this, NoteFeaturesIterator.class);
			pageContext.getOut().print(theNoteFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for features tag ");
		}
		return SKIP_BODY;
	}
}

