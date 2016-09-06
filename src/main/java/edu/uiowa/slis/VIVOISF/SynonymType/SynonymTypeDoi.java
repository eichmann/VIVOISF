package edu.uiowa.slis.VIVOISF.SynonymType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SynonymTypeDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SynonymTypeDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(SynonymTypeDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SynonymTypeDoiIterator theSynonymType = (SynonymTypeDoiIterator)findAncestorWithClass(this, SynonymTypeDoiIterator.class);
			pageContext.getOut().print(theSynonymType.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing SynonymType for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing SynonymType for doi tag ");
		}
		return SKIP_BODY;
	}
}

