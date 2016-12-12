package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Self_governing theSelf_governing = (Self_governing)findAncestorWithClass(this, Self_governing.class);
			if (!theSelf_governing.commitNeeded) {
				pageContext.getOut().print(theSelf_governing.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Self_governing theSelf_governing = (Self_governing)findAncestorWithClass(this, Self_governing.class);
			return theSelf_governing.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Self_governing for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Self_governing theSelf_governing = (Self_governing)findAncestorWithClass(this, Self_governing.class);
			theSelf_governing.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for label tag ");
		}
	}
}

