package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractReviewOfIterator theAbstractReviewOfIterator = (AbstractReviewOfIterator)findAncestorWithClass(this, AbstractReviewOfIterator.class);
			pageContext.getOut().print(theAbstractReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

