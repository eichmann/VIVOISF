package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptProducerIterator theManuscriptProducerIterator = (ManuscriptProducerIterator)findAncestorWithClass(this, ManuscriptProducerIterator.class);
			pageContext.getOut().print(theManuscriptProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for producer tag ");
		}
		return SKIP_BODY;
	}
}

