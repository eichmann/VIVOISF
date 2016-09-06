package edu.uiowa.slis.VIVOISF.Synonym;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SynonymIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SynonymIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(SynonymIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SynonymIAO_0000136Iterator theSynonymIAO_0000136Iterator = (SynonymIAO_0000136Iterator)findAncestorWithClass(this, SynonymIAO_0000136Iterator.class);
			pageContext.getOut().print(theSynonymIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Synonym for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Synonym for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

