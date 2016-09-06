package edu.uiowa.slis.VIVOISF.Synonym;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SynonymDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SynonymDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(SynonymDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SynonymDoiIterator theSynonym = (SynonymDoiIterator)findAncestorWithClass(this, SynonymDoiIterator.class);
			pageContext.getOut().print(theSynonym.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Synonym for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Synonym for doi tag ");
		}
		return SKIP_BODY;
	}
}

