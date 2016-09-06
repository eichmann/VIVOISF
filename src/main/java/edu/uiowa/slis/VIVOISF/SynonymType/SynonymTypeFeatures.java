package edu.uiowa.slis.VIVOISF.SynonymType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SynonymTypeFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SynonymTypeFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(SynonymTypeFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SynonymTypeFeaturesIterator theSynonymTypeFeaturesIterator = (SynonymTypeFeaturesIterator)findAncestorWithClass(this, SynonymTypeFeaturesIterator.class);
			pageContext.getOut().print(theSynonymTypeFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing SynonymType for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing SynonymType for features tag ");
		}
		return SKIP_BODY;
	}
}

