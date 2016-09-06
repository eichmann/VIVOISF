package edu.uiowa.slis.VIVOISF.Single_group_study;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Single_group_studyLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Single_group_studyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(Single_group_studyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Single_group_study theSingle_group_study = (Single_group_study)findAncestorWithClass(this, Single_group_study.class);
			if (!theSingle_group_study.commitNeeded) {
				pageContext.getOut().print(theSingle_group_study.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Single_group_study for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Single_group_study for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Single_group_study theSingle_group_study = (Single_group_study)findAncestorWithClass(this, Single_group_study.class);
			return theSingle_group_study.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Single_group_study for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Single_group_study for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Single_group_study theSingle_group_study = (Single_group_study)findAncestorWithClass(this, Single_group_study.class);
			theSingle_group_study.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Single_group_study for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Single_group_study for label tag ");
		}
	}
}

