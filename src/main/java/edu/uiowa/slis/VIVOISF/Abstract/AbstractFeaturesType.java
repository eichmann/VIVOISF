package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractFeaturesIterator theAbstractFeaturesIterator = (AbstractFeaturesIterator)findAncestorWithClass(this, AbstractFeaturesIterator.class);
			pageContext.getOut().print(theAbstractFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for features tag ");
		}
		return SKIP_BODY;
	}
}

