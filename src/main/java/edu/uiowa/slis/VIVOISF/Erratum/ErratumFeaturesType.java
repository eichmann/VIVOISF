package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumFeaturesIterator theErratumFeaturesIterator = (ErratumFeaturesIterator)findAncestorWithClass(this, ErratumFeaturesIterator.class);
			pageContext.getOut().print(theErratumFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for features tag ");
		}
		return SKIP_BODY;
	}
}

