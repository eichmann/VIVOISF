package edu.uiowa.slis.VIVOISF.Synonym;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SynonymFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SynonymFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(SynonymFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SynonymFeaturesIterator theSynonymFeaturesIterator = (SynonymFeaturesIterator)findAncestorWithClass(this, SynonymFeaturesIterator.class);
			pageContext.getOut().print(theSynonymFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Synonym for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Synonym for features tag ");
		}
		return SKIP_BODY;
	}
}

