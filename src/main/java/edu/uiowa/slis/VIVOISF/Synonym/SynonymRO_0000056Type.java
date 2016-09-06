package edu.uiowa.slis.VIVOISF.Synonym;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SynonymRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SynonymRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(SynonymRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SynonymRO_0000056Iterator theSynonymRO_0000056Iterator = (SynonymRO_0000056Iterator)findAncestorWithClass(this, SynonymRO_0000056Iterator.class);
			pageContext.getOut().print(theSynonymRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Synonym for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Synonym for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

