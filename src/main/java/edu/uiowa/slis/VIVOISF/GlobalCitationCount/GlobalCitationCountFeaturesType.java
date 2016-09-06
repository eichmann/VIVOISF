package edu.uiowa.slis.VIVOISF.GlobalCitationCount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GlobalCitationCountFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GlobalCitationCountFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(GlobalCitationCountFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GlobalCitationCountFeaturesIterator theGlobalCitationCountFeaturesIterator = (GlobalCitationCountFeaturesIterator)findAncestorWithClass(this, GlobalCitationCountFeaturesIterator.class);
			pageContext.getOut().print(theGlobalCitationCountFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GlobalCitationCount for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing GlobalCitationCount for features tag ");
		}
		return SKIP_BODY;
	}
}

