package edu.uiowa.slis.VIVOISF.SynonymType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SynonymTypeFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SynonymTypeFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(SynonymTypeFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SynonymTypeFeaturesIterator theSynonymTypeFeaturesIterator = (SynonymTypeFeaturesIterator)findAncestorWithClass(this, SynonymTypeFeaturesIterator.class);
			pageContext.getOut().print(theSynonymTypeFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing SynonymType for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing SynonymType for features tag ");
		}
		return SKIP_BODY;
	}
}

