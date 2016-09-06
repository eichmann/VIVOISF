package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineARG_2000028Iterator theMagazineARG_2000028Iterator = (MagazineARG_2000028Iterator)findAncestorWithClass(this, MagazineARG_2000028Iterator.class);
			pageContext.getOut().print(theMagazineARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

