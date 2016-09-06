package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperARG_2000028Iterator theNewspaperARG_2000028Iterator = (NewspaperARG_2000028Iterator)findAncestorWithClass(this, NewspaperARG_2000028Iterator.class);
			pageContext.getOut().print(theNewspaperARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

